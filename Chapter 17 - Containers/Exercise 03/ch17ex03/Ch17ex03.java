package ch17ex03;
import java.util.*;
import net.mindview.util.*;


public class Ch17ex03 {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < Countries.DATA.length; j++)
				hashSet.add(Countries.DATA[j][0]);
		}
		System.out.println(hashSet);
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < Countries.DATA.length; j++)
				linkedHashSet.add(Countries.DATA[j][0]);
		}
		System.out.println(linkedHashSet);
		Set<String> treeSet = new TreeSet<String>();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < Countries.DATA.length; j++)
				treeSet.add(Countries.DATA[j][0]);
		}
		System.out.println(treeSet);
		
	}

}

/* Output:
[BRUNEI, ISRAEL, FRANCE, ECUADOR, ALBANIA, ST. LUCIA, CONGO, SEYCHELLES, THE MALDIVES, PORTUGAL, TUNISIA, YEMEN, CUBA, BRAZIL, ALGERIA, THAILAND, MADAGASCAR, MALI, KIRIBATI, LAOS, MOLDOVA, ZIMBABWE, SENEGAL, TAJIKISTAN, BARBADOS, MAURITIUS, NORTH KOREA, MYANMAR (BURMA), LUXEMBOURG, THE NETHERLANDS, ZAMBIA, SRI LANKA, SWITZERLAND, KAZAKSTAN, JORDAN, LESOTHO, MAURITANIA, LIECHTENSTEIN, SIERRA LEONE, SAUDI ARABIA, LIBYA, KENYA, SYRIA, GABON, NEVIS, TOGO, TURKEY, MOROCCO, VATICAN CITY, GRENADA, CENTRAL AFRICAN REPUBLIC, KYRGYZSTAN, COMOROS, NAMIBIA, BELARUS (BYELORUSSIA), BAHAMAS, BAHRAIN, BOTSWANA, AUSTRALIA, BELIZE, GEORGIA, ITALY, NAURU, SURINAME, OMAN, BURUNDI, JAMAICA, NIGERIA, GUATEMALA, SOMALIA, CANADA, LIBERIA, CZECH REPUBLIC, VIETNAM, SLOVAKIA, WESTERN SAMOA, ST. VINCENT AND THE GRENADINES, PERU, UZBEKISTAN, MACEDONIA, CHINA, ETHIOPIA, BHUTAN, CROATIA, HAITI, ERITREA, CYPRUS, MONTENEGRO, RUSSIA, TANZANIA, ANDORRA, EQUATORIAL GUINEA, KUWAIT, SERBIA, NEPAL, AUSTRIA, BENIN, NICARAGUA, SPAIN, BULGARIA, VANUATU, PAKISTAN, DOMINICA, CHILE, CAMBODIA, IRAN, GHANA, IRAQ, HUNGARY, SOLOMON ISLANDS, ICELAND, INDIA, TURKMENISTAN, THE GAMBIA, SOUTH AFRICA, ARGENTINA, UKRAINE, GUYANA, CHAD, TUVALU, SOUTH KOREA, ANTIGUA AND BARBUDA, ROMANIA, ANGOLA, BOLIVIA, SWEDEN, FIJI, LATVIA, SINGAPORE, PALAU, POLAND, HONDURAS, DENMARK, LITHUANIA, SUDAN, COTE D'IVOIR (IVORY COAST), ARMENIA, BURKINA FASO, HERZEGOVINA, MALAWI, SLOVENIA, NEW ZEALAND, TONGA, AZERBAIJAN, BELGIUM, UNITED STATES OF AMERICA, ST. KITTS, BISSAU, PHILIPPINES, GUINEA, SAN MARINO, BOSNIA, TAIWAN (REPUBLIC OF CHINA), GREECE, FINLAND, IRELAND, INDONESIA, MALAYSIA, DOMINICAN REPUBLIC, MOZAMBIQUE, UNITED ARAB EMIRATES, MARSHALL ISLANDS, AFGHANISTAN, SAO TOME E PRINCIPE, TRINIDAD AND TOBAGO, PANAMA, CAPE VERDE, DJIBOUTI, SWAZILAND, URUGUAY, GERMANY, EGYPT, JAPAN, VENEZUELA, COSTA RICA, QATAR, PAPUA NEW GUINEA, MONACO, NORWAY, ESTONIA, CAMEROON, BANGLADESH, LEBANON, UGANDA, MEXICO, DEMOCRATIC REPUBLIC OF THE CONGO (ZAIRE), MICRONESIA, PARAGUAY, NIGER, COLOMBIA, EL SALVADOR, RWANDA, UNITED KINGDOM, MONGOLIA, MALTA]
[ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO, BURUNDI, CAMEROON, CAPE VERDE, CENTRAL AFRICAN REPUBLIC, CHAD, COMOROS, CONGO, DJIBOUTI, EGYPT, EQUATORIAL GUINEA, ERITREA, ETHIOPIA, GABON, THE GAMBIA, GHANA, GUINEA, BISSAU, COTE D'IVOIR (IVORY COAST), KENYA, LESOTHO, LIBERIA, LIBYA, MADAGASCAR, MALAWI, MALI, MAURITANIA, MAURITIUS, MOROCCO, MOZAMBIQUE, NAMIBIA, NIGER, NIGERIA, RWANDA, SAO TOME E PRINCIPE, SENEGAL, SEYCHELLES, SIERRA LEONE, SOMALIA, SOUTH AFRICA, SUDAN, SWAZILAND, TANZANIA, TOGO, TUNISIA, UGANDA, DEMOCRATIC REPUBLIC OF THE CONGO (ZAIRE), ZAMBIA, ZIMBABWE, AFGHANISTAN, BAHRAIN, BANGLADESH, BHUTAN, BRUNEI, CAMBODIA, CHINA, CYPRUS, INDIA, INDONESIA, IRAN, IRAQ, ISRAEL, JAPAN, JORDAN, KUWAIT, LAOS, LEBANON, MALAYSIA, THE MALDIVES, MONGOLIA, MYANMAR (BURMA), NEPAL, NORTH KOREA, OMAN, PAKISTAN, PHILIPPINES, QATAR, SAUDI ARABIA, SINGAPORE, SOUTH KOREA, SRI LANKA, SYRIA, TAIWAN (REPUBLIC OF CHINA), THAILAND, TURKEY, UNITED ARAB EMIRATES, VIETNAM, YEMEN, AUSTRALIA, FIJI, KIRIBATI, MARSHALL ISLANDS, MICRONESIA, NAURU, NEW ZEALAND, PALAU, PAPUA NEW GUINEA, SOLOMON ISLANDS, TONGA, TUVALU, VANUATU, WESTERN SAMOA, ARMENIA, AZERBAIJAN, BELARUS (BYELORUSSIA), BULGARIA, GEORGIA, KAZAKSTAN, KYRGYZSTAN, MOLDOVA, RUSSIA, TAJIKISTAN, TURKMENISTAN, UKRAINE, UZBEKISTAN, ALBANIA, ANDORRA, AUSTRIA, BELGIUM, BOSNIA, HERZEGOVINA, CROATIA, CZECH REPUBLIC, DENMARK, ESTONIA, FINLAND, FRANCE, GERMANY, GREECE, HUNGARY, ICELAND, IRELAND, ITALY, LATVIA, LIECHTENSTEIN, LITHUANIA, LUXEMBOURG, MACEDONIA, MALTA, MONACO, MONTENEGRO, THE NETHERLANDS, NORWAY, POLAND, PORTUGAL, ROMANIA, SAN MARINO, SERBIA, SLOVAKIA, SLOVENIA, SPAIN, SWEDEN, SWITZERLAND, UNITED KINGDOM, VATICAN CITY, ANTIGUA AND BARBUDA, BAHAMAS, BARBADOS, BELIZE, CANADA, COSTA RICA, CUBA, DOMINICA, DOMINICAN REPUBLIC, EL SALVADOR, GRENADA, GUATEMALA, HAITI, HONDURAS, JAMAICA, MEXICO, NICARAGUA, PANAMA, ST. KITTS, NEVIS, ST. LUCIA, ST. VINCENT AND THE GRENADINES, UNITED STATES OF AMERICA, ARGENTINA, BOLIVIA, BRAZIL, CHILE, COLOMBIA, ECUADOR, GUYANA, PARAGUAY, PERU, SURINAME, TRINIDAD AND TOBAGO, URUGUAY, VENEZUELA]
[AFGHANISTAN, ALBANIA, ALGERIA, ANDORRA, ANGOLA, ANTIGUA AND BARBUDA, ARGENTINA, ARMENIA, AUSTRALIA, AUSTRIA, AZERBAIJAN, BAHAMAS, BAHRAIN, BANGLADESH, BARBADOS, BELARUS (BYELORUSSIA), BELGIUM, BELIZE, BENIN, BHUTAN, BISSAU, BOLIVIA, BOSNIA, BOTSWANA, BRAZIL, BRUNEI, BULGARIA, BURKINA FASO, BURUNDI, CAMBODIA, CAMEROON, CANADA, CAPE VERDE, CENTRAL AFRICAN REPUBLIC, CHAD, CHILE, CHINA, COLOMBIA, COMOROS, CONGO, COSTA RICA, COTE D'IVOIR (IVORY COAST), CROATIA, CUBA, CYPRUS, CZECH REPUBLIC, DEMOCRATIC REPUBLIC OF THE CONGO (ZAIRE), DENMARK, DJIBOUTI, DOMINICA, DOMINICAN REPUBLIC, ECUADOR, EGYPT, EL SALVADOR, EQUATORIAL GUINEA, ERITREA, ESTONIA, ETHIOPIA, FIJI, FINLAND, FRANCE, GABON, GEORGIA, GERMANY, GHANA, GREECE, GRENADA, GUATEMALA, GUINEA, GUYANA, HAITI, HERZEGOVINA, HONDURAS, HUNGARY, ICELAND, INDIA, INDONESIA, IRAN, IRAQ, IRELAND, ISRAEL, ITALY, JAMAICA, JAPAN, JORDAN, KAZAKSTAN, KENYA, KIRIBATI, KUWAIT, KYRGYZSTAN, LAOS, LATVIA, LEBANON, LESOTHO, LIBERIA, LIBYA, LIECHTENSTEIN, LITHUANIA, LUXEMBOURG, MACEDONIA, MADAGASCAR, MALAWI, MALAYSIA, MALI, MALTA, MARSHALL ISLANDS, MAURITANIA, MAURITIUS, MEXICO, MICRONESIA, MOLDOVA, MONACO, MONGOLIA, MONTENEGRO, MOROCCO, MOZAMBIQUE, MYANMAR (BURMA), NAMIBIA, NAURU, NEPAL, NEVIS, NEW ZEALAND, NICARAGUA, NIGER, NIGERIA, NORTH KOREA, NORWAY, OMAN, PAKISTAN, PALAU, PANAMA, PAPUA NEW GUINEA, PARAGUAY, PERU, PHILIPPINES, POLAND, PORTUGAL, QATAR, ROMANIA, RUSSIA, RWANDA, SAN MARINO, SAO TOME E PRINCIPE, SAUDI ARABIA, SENEGAL, SERBIA, SEYCHELLES, SIERRA LEONE, SINGAPORE, SLOVAKIA, SLOVENIA, SOLOMON ISLANDS, SOMALIA, SOUTH AFRICA, SOUTH KOREA, SPAIN, SRI LANKA, ST. KITTS, ST. LUCIA, ST. VINCENT AND THE GRENADINES, SUDAN, SURINAME, SWAZILAND, SWEDEN, SWITZERLAND, SYRIA, TAIWAN (REPUBLIC OF CHINA), TAJIKISTAN, TANZANIA, THAILAND, THE GAMBIA, THE MALDIVES, THE NETHERLANDS, TOGO, TONGA, TRINIDAD AND TOBAGO, TUNISIA, TURKEY, TURKMENISTAN, TUVALU, UGANDA, UKRAINE, UNITED ARAB EMIRATES, UNITED KINGDOM, UNITED STATES OF AMERICA, URUGUAY, UZBEKISTAN, VANUATU, VATICAN CITY, VENEZUELA, VIETNAM, WESTERN SAMOA, YEMEN, ZAMBIA, ZIMBABWE]
*/