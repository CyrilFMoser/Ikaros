package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], T_A[Byte]], b: T_A[T_B[Boolean, Boolean]], c: T_A[T_B[Byte, Boolean]]) extends T_A[T_B[T_B[Int, (Boolean,Int)], (Char,Int)]]
case class CC_B() extends T_A[T_B[T_B[Int, (Boolean,Int)], (Char,Int)]]
case class CC_C(a: Boolean) extends T_B[Byte, T_A[CC_A]]
case class CC_D(a: CC_A) extends T_B[Byte, T_A[CC_A]]

val v_a: T_A[T_B[T_B[Int, (Boolean,Int)], (Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}