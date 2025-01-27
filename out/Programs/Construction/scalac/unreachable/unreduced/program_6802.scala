package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: (T_B,Byte), c: (T_A[T_B, T_B],T_B)) extends T_A[C, Int]
case class CC_B[D](a: T_A[D, D], b: Boolean) extends T_A[D, Int]
case class CC_C() extends T_B
case class CC_D(a: T_B, b: CC_B[CC_C], c: T_A[CC_A[(Char,Byte)], Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
}
}