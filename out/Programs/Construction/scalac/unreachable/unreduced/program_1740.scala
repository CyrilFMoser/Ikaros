package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: (T_A[Boolean, Byte],T_B[Int]), b: T_B[E]) extends T_A[D, E]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_C(a: T_A[T_A[Int, Byte], CC_A[Byte, Char]], b: Int, c: CC_A[Char, CC_B[(Int,Byte), Char]]) extends T_B[CC_B[((Int,Boolean),Boolean), Boolean]]
case class CC_D(a: T_A[CC_B[Byte, CC_C], T_A[CC_C, Int]]) extends T_B[CC_B[((Int,Boolean),Boolean), Boolean]]
case class CC_E(a: T_A[T_A[CC_C, CC_C], CC_C], b: CC_C, c: (T_A[Int, CC_D],T_A[CC_D, CC_C])) extends T_B[CC_B[((Int,Boolean),Boolean), Boolean]]

val v_a: T_B[CC_B[((Int,Boolean),Boolean), Boolean]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_A(_, _)) => 1 
  case CC_E(_, CC_C(_, _, _), _) => 2 
}
}
// This is not matched: CC_D(CC_B())