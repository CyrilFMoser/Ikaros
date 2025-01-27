package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B(a: CC_A[CC_A[Byte]], b: T_A[Int, T_A[Int, Int]], c: T_A[(Boolean,Char), CC_A[Int]]) extends T_A[Boolean, T_A[Boolean, Boolean]]
case class CC_C[D](a: T_A[D, T_A[D, D]], b: T_A[CC_A[D], T_A[CC_A[D], CC_A[D]]]) extends T_A[D, T_A[D, D]]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), _) => 0 
  case CC_C(CC_C(_, _), _) => 1 
}
}