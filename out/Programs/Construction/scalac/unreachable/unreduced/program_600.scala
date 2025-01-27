package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[Boolean, D], b: T_A[D, Byte], c: (T_A[Boolean, Byte],T_B[Int])) extends T_A[D, Byte]
case class CC_B[E](a: (T_B[Int],T_A[Boolean, Byte]), b: Int, c: T_A[T_A[(Boolean,(Boolean,Char)), Byte], Byte]) extends T_A[E, Byte]
case class CC_C(a: CC_A[Int], b: T_A[CC_B[Int], Byte]) extends T_B[Byte]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), (_,_)) => 0 
  case CC_A(_, CC_B(_, _, _), (_,_)) => 1 
  case CC_B(_, _, _) => 2 
}
}