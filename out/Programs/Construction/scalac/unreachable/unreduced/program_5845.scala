package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: C, c: T_A[C, C]) extends T_A[Boolean, C]
case class CC_B(a: CC_A[Int]) extends T_B
case class CC_C(a: (T_A[T_B, (Byte,Int)],(Char,T_B))) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_C(_) => 1 
}
}