package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[Boolean, T_A[Char, Byte]]) extends T_A[T_A[Int, T_A[Byte, Char]], (Byte,(Boolean,Byte))]
case class CC_B(a: Byte) extends T_A[T_A[Int, T_A[Byte, Char]], (Byte,(Boolean,Byte))]
case class CC_C(a: Byte, b: Int, c: T_A[Int, CC_A]) extends T_A[T_A[Int, T_A[Byte, Char]], (Byte,(Boolean,Byte))]
case class CC_D[D](a: T_A[CC_C, D]) extends T_B[D]

val v_a: T_A[T_A[Int, T_A[Byte, Char]], (Byte,(Boolean,Byte))] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_)