package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: C, c: T_A[C]) extends T_A[C]
case class CC_B[D](a: CC_A[D], b: CC_A[D]) extends T_A[Int]
case class CC_C(a: Char, b: T_B[(Byte,(Int,Int))], c: T_A[T_A[Int]]) extends T_A[Int]
case class CC_D(a: Int) extends T_B[T_B[T_B[CC_C]]]
case class CC_E(a: Int, b: CC_A[(CC_D,CC_C)]) extends T_B[T_B[T_B[CC_C]]]
case class CC_F(a: Byte, b: (T_A[Byte],(CC_D,CC_E))) extends T_B[T_B[T_B[CC_C]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, _) => 0 
  case CC_A(CC_A(_, _, CC_B(_, _)), _, _) => 1 
  case CC_A(CC_A(_, _, CC_C(_, _, _)), _, _) => 2 
  case CC_A(CC_B(_, _), _, _) => 3 
  case CC_A(CC_C(_, _, CC_A(_, _, _)), _, _) => 4 
  case CC_B(_, _) => 5 
  case CC_C(_, _, _) => 6 
}
}