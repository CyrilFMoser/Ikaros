package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A[T_A[Boolean]], b: CC_A[T_A[Boolean]], c: CC_A[T_A[Byte]]) extends T_A[T_A[T_A[Byte]]]
case class CC_C[D](a: CC_A[D], b: D, c: CC_B) extends T_A[D]
case class CC_D(a: Int, b: T_B[CC_B], c: T_B[T_B[CC_B]]) extends T_B[CC_B]
case class CC_E(a: T_A[CC_B], b: CC_D, c: CC_C[Boolean]) extends T_B[CC_B]
case class CC_F(a: CC_A[T_B[CC_E]], b: CC_E, c: T_A[(CC_D,CC_D)]) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_E(CC_C(CC_A(_), _, _), CC_D(_, _, _), CC_C(CC_A(_), _, CC_B(_, _, _))) => 0 
  case CC_F(_, _, CC_C(CC_A(_), (_,_), CC_B(_, _, _))) => 1 
}
}
// This is not matched: CC_D(_, _, _)