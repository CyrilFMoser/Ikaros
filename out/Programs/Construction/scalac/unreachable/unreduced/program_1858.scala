package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_A[T_B[Int]]]
case class CC_B(a: T_B[Byte], b: T_A[T_B[(Int,Int)]]) extends T_B[Byte]
case class CC_C() extends T_B[Byte]
case class CC_D(a: Boolean, b: T_A[(Boolean,(Byte,Boolean))], c: T_B[T_A[CC_A]]) extends T_B[T_A[CC_A]]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
  case CC_B(CC_C(), _) => 1 
  case CC_C() => 2 
}
}