package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Boolean]) extends T_A[Boolean]
case class CC_B[D](a: ((CC_A,(Char,Byte)),Byte), b: T_A[Boolean], c: D) extends T_B[D, T_A[D]]
case class CC_C() extends T_B[T_B[T_A[Boolean], T_A[T_A[Boolean]]], T_A[T_B[T_A[Boolean], T_A[T_A[Boolean]]]]]
case class CC_D(a: T_B[T_A[Boolean], (CC_C,CC_C)], b: T_A[T_A[Boolean]], c: CC_C) extends T_B[T_B[T_A[Boolean], T_A[T_A[Boolean]]], T_A[T_B[T_A[Boolean], T_A[T_A[Boolean]]]]]

val v_a: T_B[T_B[T_A[Boolean], T_A[T_A[Boolean]]], T_A[T_B[T_A[Boolean], T_A[T_A[Boolean]]]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(CC_A(_)), _) => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_C()