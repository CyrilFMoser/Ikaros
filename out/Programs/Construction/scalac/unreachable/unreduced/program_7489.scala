package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Boolean, Int]], b: Byte) extends T_A[T_B[(Int,Byte), Char]]
case class CC_B(a: Byte, b: (T_A[CC_A],T_A[CC_A])) extends T_A[T_B[(Int,Byte), Char]]
case class CC_C(a: T_A[T_B[(Boolean,Char), CC_A]], b: ((CC_B,CC_A),T_B[CC_B, CC_B]), c: T_A[Char]) extends T_B[T_A[(Boolean,Char)], Boolean]
case class CC_D() extends T_B[T_A[(Boolean,Char)], Boolean]
case class CC_E(a: CC_B) extends T_B[T_A[(Boolean,Char)], Boolean]

val v_a: T_B[T_A[(Boolean,Char)], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D() => 1 
  case CC_E(CC_B(_, _)) => 2 
}
}