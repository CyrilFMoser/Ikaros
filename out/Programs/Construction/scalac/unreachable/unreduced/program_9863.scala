package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: (Int,Byte), b: T_A[T_A[Char, Boolean], (Boolean,Byte)], c: T_B[T_B[Boolean]]) extends T_A[T_A[T_B[Boolean], T_B[Char]], T_A[T_B[Char], (Byte,Char)]]
case class CC_B[D](a: T_B[D], b: T_B[T_B[CC_A]]) extends T_B[T_B[CC_A]]
case class CC_C() extends T_B[T_B[CC_A]]
case class CC_D(a: T_B[CC_B[CC_A]], b: T_B[T_B[CC_A]]) extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_B(_, _)