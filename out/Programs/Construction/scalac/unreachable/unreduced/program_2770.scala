package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, (T_A[Int, Int],T_A[Int, Char])]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, (T_A[Int, Int],T_A[Int, Char])]
case class CC_C[E](a: E) extends T_A[E, (T_A[Int, Int],T_A[Int, Char])]

val v_a: T_A[Boolean, (T_A[Int, Int],T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A(true, _) => 0 
  case CC_A(false, _) => 1 
  case CC_B(_) => 2 
  case CC_C(_) => 3 
}
}