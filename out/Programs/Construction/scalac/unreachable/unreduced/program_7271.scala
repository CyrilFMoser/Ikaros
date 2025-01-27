package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_A[Char, Byte]], b: T_A[T_A[(Char,Int), (Int,Byte)], (T_B,Byte)], c: (T_B,T_B)) extends T_A[T_A[T_B, T_A[T_B, T_B]], (T_A[T_B, T_B],T_A[T_B, T_B])]
case class CC_B(a: CC_A, b: (T_A[T_B, CC_A],CC_A), c: T_B) extends T_A[T_A[T_B, T_A[T_B, T_B]], (T_A[T_B, T_B],T_A[T_B, T_B])]
case class CC_C(a: T_B) extends T_B
case class CC_D(a: CC_A) extends T_B
case class CC_E(a: Char, b: CC_C, c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
  case CC_C(CC_D(CC_A(_, _, _))) => 1 
  case CC_C(CC_E(_, _, _)) => 2 
  case CC_D(_) => 3 
  case CC_E(_, CC_C(CC_D(_)), CC_C(CC_C(_))) => 4 
  case CC_E(_, CC_C(CC_E(_, _, _)), CC_C(CC_C(_))) => 5 
  case CC_E(_, CC_C(CC_C(_)), CC_C(CC_D(_))) => 6 
  case CC_E(_, CC_C(CC_D(_)), CC_C(CC_D(_))) => 7 
  case CC_E(_, CC_C(CC_E(_, _, _)), CC_C(CC_D(_))) => 8 
  case CC_E(_, CC_C(CC_C(_)), CC_C(CC_E(_, _, _))) => 9 
  case CC_E(_, CC_C(CC_D(_)), CC_C(CC_E(_, _, _))) => 10 
  case CC_E(_, CC_C(CC_E(_, _, _)), CC_C(CC_E(_, _, _))) => 11 
  case CC_E(_, CC_C(CC_C(_)), CC_D(CC_A(_, _, _))) => 12 
  case CC_E(_, CC_C(CC_D(_)), CC_D(CC_A(_, _, _))) => 13 
  case CC_E(_, CC_C(CC_E(_, _, _)), CC_D(CC_A(_, _, _))) => 14 
  case CC_E(_, CC_C(CC_C(_)), CC_E(_, _, CC_C(_))) => 15 
  case CC_E(_, CC_C(CC_D(_)), CC_E(_, _, CC_C(_))) => 16 
  case CC_E(_, CC_C(CC_E(_, _, _)), CC_E(_, _, CC_C(_))) => 17 
  case CC_E(_, CC_C(CC_C(_)), CC_E(_, _, CC_D(_))) => 18 
  case CC_E(_, CC_C(CC_D(_)), CC_E(_, _, CC_D(_))) => 19 
  case CC_E(_, CC_C(CC_E(_, _, _)), CC_E(_, _, CC_D(_))) => 20 
  case CC_E(_, CC_C(CC_C(_)), CC_E(_, _, CC_E(_, _, _))) => 21 
  case CC_E(_, CC_C(CC_D(_)), CC_E(_, _, CC_E(_, _, _))) => 22 
  case CC_E(_, CC_C(CC_E(_, _, _)), CC_E(_, _, CC_E(_, _, _))) => 23 
}
}
// This is not matched: CC_E(_, CC_C(CC_C(_)), CC_C(CC_C(_)))