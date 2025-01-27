package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Byte], T_A[Int, (Boolean,Int)]]) extends T_A[T_A[T_A[Int, (Boolean,Int)], T_A[Boolean, Boolean]], T_A[T_A[Int, Byte], T_A[(Int,Int), Int]]]
case class CC_B[C](a: Boolean) extends T_A[CC_A, C]
case class CC_C(a: T_A[CC_A, (CC_A,(Int,Int))], b: T_A[CC_A, CC_B[CC_A]]) extends T_A[T_A[T_A[Int, (Boolean,Int)], T_A[Boolean, Boolean]], T_A[T_A[Int, Byte], T_A[(Int,Int), Int]]]

val v_a: T_A[T_A[T_A[Int, (Boolean,Int)], T_A[Boolean, Boolean]], T_A[T_A[Int, Byte], T_A[(Int,Int), Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, CC_B(_)) => 1 
}
}