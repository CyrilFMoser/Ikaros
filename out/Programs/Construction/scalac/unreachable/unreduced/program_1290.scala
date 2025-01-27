package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, F], b: (T_A[Boolean, Boolean],T_A[Int, Boolean]), c: (Boolean,T_A[Byte, Byte])) extends T_A[E, F]
case class CC_B[G, H](a: T_A[(Int,Byte), (Int,Byte)]) extends T_A[G, H]
case class CC_C[I](a: I, b: CC_A[I, I]) extends T_A[I, T_A[Int, Char]]
case class CC_D[J]() extends T_B[J, CC_B[J, J]]

val v_a: T_A[Int, T_A[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), (_,_)) => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_C(_, CC_A(_, _, _)) => 2 
}
}
// This is not matched: CC_B(CC_A(_, _, _))