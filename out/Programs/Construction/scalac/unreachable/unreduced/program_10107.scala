package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[Byte]
case class CC_B(a: T_A[T_A[CC_A]], b: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: T_B, b: T_B, c: T_B) extends T_B
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: CC_B, b: T_B, c: CC_D) extends T_B

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_C(_, _, _), _, CC_C(_, _, _)), CC_C(_, _, _)) => 0 
  case CC_A(CC_C(CC_C(_, _, _), _, CC_C(_, _, _)), CC_D(CC_C(_, _, _))) => 1 
  case CC_A(CC_C(CC_C(_, _, _), _, CC_C(_, _, _)), CC_E(CC_B(_, _), CC_C(_, _, _), CC_D(_))) => 2 
  case CC_A(CC_C(CC_C(_, _, _), _, CC_C(_, _, _)), CC_E(CC_B(_, _), CC_D(_), CC_D(_))) => 3 
  case CC_A(CC_C(CC_C(_, _, _), _, CC_C(_, _, _)), CC_E(CC_B(_, _), CC_E(_, _, _), CC_D(_))) => 4 
  case CC_A(CC_C(CC_C(_, _, _), _, CC_D(_)), CC_C(_, _, _)) => 5 
  case CC_A(CC_C(CC_C(_, _, _), _, CC_D(_)), CC_D(CC_C(_, _, _))) => 6 
  case CC_A(CC_C(CC_C(_, _, _), _, CC_D(_)), CC_E(CC_B(_, _), CC_C(_, _, _), CC_D(_))) => 7 
  case CC_A(CC_C(CC_C(_, _, _), _, CC_D(_)), CC_E(CC_B(_, _), CC_D(_), CC_D(_))) => 8 
  case CC_A(CC_C(CC_C(_, _, _), _, CC_D(_)), CC_E(CC_B(_, _), CC_E(_, _, _), CC_D(_))) => 9 
  case CC_A(CC_C(CC_C(_, _, _), _, CC_E(_, _, _)), CC_C(_, _, _)) => 10 
  case CC_A(CC_C(CC_C(_, _, _), _, CC_E(_, _, _)), CC_D(CC_C(_, _, _))) => 11 
  case CC_A(CC_C(CC_C(_, _, _), _, CC_E(_, _, _)), CC_E(CC_B(_, _), CC_C(_, _, _), CC_D(_))) => 12 
  case CC_A(CC_C(CC_C(_, _, _), _, CC_E(_, _, _)), CC_E(CC_B(_, _), CC_D(_), CC_D(_))) => 13 
  case CC_A(CC_C(CC_C(_, _, _), _, CC_E(_, _, _)), CC_E(CC_B(_, _), CC_E(_, _, _), CC_D(_))) => 14 
  case CC_A(CC_C(CC_D(_), _, CC_C(_, _, _)), CC_C(_, _, _)) => 15 
  case CC_A(CC_C(CC_D(_), _, CC_C(_, _, _)), CC_D(CC_C(_, _, _))) => 16 
  case CC_A(CC_C(CC_D(_), _, CC_C(_, _, _)), CC_E(CC_B(_, _), CC_C(_, _, _), CC_D(_))) => 17 
  case CC_A(CC_C(CC_D(_), _, CC_C(_, _, _)), CC_E(CC_B(_, _), CC_D(_), CC_D(_))) => 18 
  case CC_A(CC_C(CC_D(_), _, CC_C(_, _, _)), CC_E(CC_B(_, _), CC_E(_, _, _), CC_D(_))) => 19 
  case CC_A(CC_C(CC_D(_), _, CC_D(_)), CC_C(_, _, _)) => 20 
  case CC_A(CC_C(CC_D(_), _, CC_D(_)), CC_D(CC_C(_, _, _))) => 21 
  case CC_A(CC_C(CC_D(_), _, CC_D(_)), CC_E(CC_B(_, _), CC_C(_, _, _), CC_D(_))) => 22 
  case CC_A(CC_C(CC_D(_), _, CC_D(_)), CC_E(CC_B(_, _), CC_D(_), CC_D(_))) => 23 
  case CC_A(CC_C(CC_D(_), _, CC_D(_)), CC_E(CC_B(_, _), CC_E(_, _, _), CC_D(_))) => 24 
  case CC_A(CC_C(CC_D(_), _, CC_E(_, _, _)), CC_C(_, _, _)) => 25 
  case CC_A(CC_C(CC_D(_), _, CC_E(_, _, _)), CC_D(CC_C(_, _, _))) => 26 
  case CC_A(CC_C(CC_D(_), _, CC_E(_, _, _)), CC_E(CC_B(_, _), CC_C(_, _, _), CC_D(_))) => 27 
  case CC_A(CC_C(CC_D(_), _, CC_E(_, _, _)), CC_E(CC_B(_, _), CC_D(_), CC_D(_))) => 28 
  case CC_A(CC_C(CC_D(_), _, CC_E(_, _, _)), CC_E(CC_B(_, _), CC_E(_, _, _), CC_D(_))) => 29 
  case CC_A(CC_C(CC_E(_, _, _), _, CC_C(_, _, _)), CC_C(_, _, _)) => 30 
  case CC_A(CC_C(CC_E(_, _, _), _, CC_C(_, _, _)), CC_D(CC_C(_, _, _))) => 31 
  case CC_A(CC_C(CC_E(_, _, _), _, CC_C(_, _, _)), CC_E(CC_B(_, _), CC_C(_, _, _), CC_D(_))) => 32 
  case CC_A(CC_C(CC_E(_, _, _), _, CC_C(_, _, _)), CC_E(CC_B(_, _), CC_D(_), CC_D(_))) => 33 
  case CC_A(CC_C(CC_E(_, _, _), _, CC_C(_, _, _)), CC_E(CC_B(_, _), CC_E(_, _, _), CC_D(_))) => 34 
  case CC_A(CC_C(CC_E(_, _, _), _, CC_D(_)), CC_C(_, _, _)) => 35 
  case CC_A(CC_C(CC_E(_, _, _), _, CC_D(_)), CC_D(CC_C(_, _, _))) => 36 
  case CC_A(CC_C(CC_E(_, _, _), _, CC_D(_)), CC_E(CC_B(_, _), CC_C(_, _, _), CC_D(_))) => 37 
  case CC_A(CC_C(CC_E(_, _, _), _, CC_D(_)), CC_E(CC_B(_, _), CC_D(_), CC_D(_))) => 38 
  case CC_A(CC_C(CC_E(_, _, _), _, CC_D(_)), CC_E(CC_B(_, _), CC_E(_, _, _), CC_D(_))) => 39 
  case CC_A(CC_C(CC_E(_, _, _), _, CC_E(_, _, _)), CC_C(_, _, _)) => 40 
  case CC_A(CC_C(CC_E(_, _, _), _, CC_E(_, _, _)), CC_D(CC_C(_, _, _))) => 41 
  case CC_A(CC_C(CC_E(_, _, _), _, CC_E(_, _, _)), CC_E(CC_B(_, _), CC_C(_, _, _), CC_D(_))) => 42 
  case CC_A(CC_C(CC_E(_, _, _), _, CC_E(_, _, _)), CC_E(CC_B(_, _), CC_D(_), CC_D(_))) => 43 
  case CC_A(CC_C(CC_E(_, _, _), _, CC_E(_, _, _)), CC_E(CC_B(_, _), CC_E(_, _, _), CC_D(_))) => 44 
  case CC_A(CC_D(_), CC_C(_, _, _)) => 45 
  case CC_A(CC_D(_), CC_D(CC_C(_, _, _))) => 46 
  case CC_A(CC_D(_), CC_E(CC_B(_, _), CC_C(_, _, _), CC_D(_))) => 47 
  case CC_A(CC_D(_), CC_E(CC_B(_, _), CC_D(_), CC_D(_))) => 48 
  case CC_A(CC_D(_), CC_E(CC_B(_, _), CC_E(_, _, _), CC_D(_))) => 49 
  case CC_A(CC_E(_, _, CC_D(_)), CC_C(_, _, _)) => 50 
  case CC_A(CC_E(_, _, CC_D(_)), CC_D(CC_C(_, _, _))) => 51 
  case CC_A(CC_E(_, _, CC_D(_)), CC_E(CC_B(_, _), CC_C(_, _, _), CC_D(_))) => 52 
  case CC_A(CC_E(_, _, CC_D(_)), CC_E(CC_B(_, _), CC_D(_), CC_D(_))) => 53 
  case CC_A(CC_E(_, _, CC_D(_)), CC_E(CC_B(_, _), CC_E(_, _, _), CC_D(_))) => 54 
  case CC_B(_, CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 55 
  case CC_B(_, CC_A(CC_D(_), CC_C(_, _, _))) => 56 
  case CC_B(_, CC_A(CC_E(_, _, _), CC_C(_, _, _))) => 57 
  case CC_B(_, CC_A(CC_C(_, _, _), CC_D(_))) => 58 
  case CC_B(_, CC_A(CC_D(_), CC_D(_))) => 59 
  case CC_B(_, CC_A(CC_E(_, _, _), CC_D(_))) => 60 
  case CC_B(_, CC_A(CC_C(_, _, _), CC_E(_, _, _))) => 61 
  case CC_B(_, CC_A(CC_D(_), CC_E(_, _, _))) => 62 
  case CC_B(_, CC_A(CC_E(_, _, _), CC_E(_, _, _))) => 63 
  case CC_B(_, CC_B(_, _)) => 64 
}
}