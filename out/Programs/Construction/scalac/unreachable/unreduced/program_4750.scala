package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,T_A[Boolean, Byte]), b: T_A[T_A[T_A[Int, Int], T_A[Int, Int]], T_A[T_A[T_A[Int, Int], T_A[Int, Int]], T_A[T_A[Int, Int], T_A[Int, Int]]]], c: T_A[C, Int]) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: Boolean) extends T_A[E, T_A[E, E]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A((true,_), _, _) => 0 
  case CC_A((false,_), _, _) => 1 
  case CC_B(_) => 2 
}
}