package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B, c: Int) extends T_A[B]
case class CC_B[C](a: Boolean, b: C, c: (T_A[Boolean],T_A[Char])) extends T_A[C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_A(CC_B(_, _, (_,_)), _, _)