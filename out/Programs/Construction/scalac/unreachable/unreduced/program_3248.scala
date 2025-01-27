package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, C]]) extends T_A[C, (Byte,(Int,Char))]
case class CC_B(a: CC_A[T_A[Boolean, Int]]) extends T_A[CC_A[(Int,Boolean)], (Byte,(Int,Char))]
case class CC_C(a: CC_A[CC_A[CC_B]], b: CC_B, c: CC_A[CC_B]) extends T_A[CC_A[(Int,Boolean)], (Byte,(Int,Char))]

val v_a: T_A[CC_A[(Int,Boolean)], (Byte,(Int,Char))] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _))