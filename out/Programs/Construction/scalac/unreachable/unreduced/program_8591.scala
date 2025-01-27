package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[T_A[T_A[Int, Byte], T_A[Int, Byte]], T_A[T_A[Int, Byte], T_A[Int, Byte]]], T_A[T_A[Int, Byte], T_A[Int, Byte]]], b: (CC_A[Byte],CC_A[(Int,Boolean)]), c: D) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, CC_A(_, _)), _, 0) => 1 
  case CC_B(CC_A(_, CC_A(_, _)), _, _) => 2 
  case CC_B(CC_A(_, CC_B(_, _, _)), _, 0) => 3 
  case CC_B(CC_A(_, CC_B(_, _, _)), _, _) => 4 
  case CC_B(CC_B(_, (_,_), _), _, 0) => 5 
  case CC_B(CC_B(_, (_,_), _), _, _) => 6 
}
}