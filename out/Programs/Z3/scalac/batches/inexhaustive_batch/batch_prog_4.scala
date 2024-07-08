package Program_4 

 object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), CC_B(CC_A(_, _))) => 0 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_A(CC_B(_), CC_A(_, _))) => 1 
  case CC_A(CC_B(_), CC_A(CC_B(_), _)) => 2 
  case CC_A(CC_B(CC_A(_, _)), CC_A(_, CC_A(_, _))) => 3 
  case CC_A(CC_B(_), CC_A(CC_A(_, _), _)) => 4 
  case CC_A(CC_A(CC_B(_), _), CC_A(CC_A(_, _), _)) => 5 
  case CC_A(_, CC_A(CC_A(_, _), CC_B(_))) => 6 
  case CC_A(CC_A(_, CC_A(_, _)), CC_B(_)) => 7 
  case CC_A(CC_A(_, _), CC_A(_, CC_B(_))) => 8 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_B(CC_A(_, _))) => 9 
  case CC_A(CC_A(CC_B(_), _), CC_A(_, CC_A(_, _))) => 10 
  case CC_A(CC_B(_), CC_A(CC_A(_, _), CC_A(_, _))) => 11 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_B(_), _)) => 12 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_B(CC_A(_, _))) => 13 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_A(CC_B(_), CC_A(_, _))) => 14 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_A(CC_B(_), CC_A(_, _))) => 15 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), CC_B(_))) => 16 
  case CC_A(_, CC_A(_, CC_B(_))) => 17 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), _)) => 18 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_A(_, CC_B(_))) => 19 
  case CC_A(CC_B(_), CC_A(_, _)) => 20 
  case CC_A(_, CC_A(_, CC_A(_, _))) => 21 
  case CC_A(_, _) => 22 
  case CC_A(_, CC_A(CC_B(_), CC_B(_))) => 23 
  case CC_A(CC_B(CC_A(_, _)), CC_A(CC_A(_, _), _)) => 24 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_B(_)) => 25 
  case CC_A(CC_A(CC_B(_), _), CC_A(CC_A(_, _), CC_A(_, _))) => 26 
  case CC_A(CC_A(_, CC_B(_)), _) => 27 
  case CC_A(CC_B(CC_A(_, _)), CC_A(CC_B(_), CC_A(_, _))) => 28 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_A(_, CC_B(_))) => 29 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), _)) => 30 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 31 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_A(CC_A(_, _), CC_A(_, _))) => 32 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_), CC_B(_))) => 33 
  case CC_A(CC_A(CC_B(_), _), _) => 34 
  case CC_A(CC_A(_, CC_A(_, _)), CC_B(CC_A(_, _))) => 35 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_A(_, CC_A(_, _))) => 36 
  case CC_A(_, CC_A(CC_A(_, _), CC_A(_, _))) => 37 
  case CC_A(CC_B(_), CC_A(_, CC_B(_))) => 38 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), CC_B(_))) => 39 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 40 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(_, CC_A(_, _))) => 41 
  case CC_A(CC_A(CC_A(_, _), _), CC_B(_)) => 42 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(_, CC_B(_))) => 43 
  case CC_A(CC_A(_, _), CC_A(CC_B(_), CC_B(_))) => 44 
  case CC_A(CC_A(CC_B(_), _), CC_A(CC_A(_, _), CC_B(_))) => 45 
  case CC_A(CC_A(_, _), CC_A(CC_A(_, _), _)) => 46 
  case CC_A(CC_A(_, CC_B(_)), CC_A(_, CC_B(_))) => 47 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_), _)) => 48 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_A(CC_A(_, _), CC_B(_))) => 49 
  case CC_A(CC_B(CC_A(_, _)), CC_A(_, _)) => 50 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_A(_, _)) => 51 
  case CC_A(CC_A(CC_B(_), _), CC_B(_)) => 52 
  case CC_A(CC_B(_), CC_A(_, CC_A(_, _))) => 53 
  case CC_A(_, CC_A(CC_B(_), CC_A(_, _))) => 54 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(_, _)) => 55 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_B(_), _)) => 56 
  case CC_A(CC_B(CC_A(_, _)), CC_B(CC_A(_, _))) => 57 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(_, _)) => 58 
  case CC_A(CC_A(_, CC_B(_)), CC_B(CC_A(_, _))) => 59 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_B(CC_A(_, _))) => 60 
  case CC_A(CC_A(CC_B(_), _), CC_A(CC_B(_), _)) => 61 
  case CC_A(CC_A(_, CC_B(_)), CC_A(_, _)) => 62 
  case CC_A(CC_A(_, CC_A(_, _)), _) => 63 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_A(_, _)) => 64 
}
}