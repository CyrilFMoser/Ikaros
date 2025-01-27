package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Boolean) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_A[(Int,Boolean), Char], Int], b: (T_A[Byte, Int],CC_A[Char, Byte]), c: Boolean) extends T_A[CC_A[Int, T_A[Boolean, Boolean]], T_A[CC_A[Int, T_A[Boolean, Boolean]], CC_A[Int, T_A[Boolean, Boolean]]]]

val v_a: T_A[CC_A[Int, T_A[Boolean, Boolean]], T_A[CC_A[Int, T_A[Boolean, Boolean]], CC_A[Int, T_A[Boolean, Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}