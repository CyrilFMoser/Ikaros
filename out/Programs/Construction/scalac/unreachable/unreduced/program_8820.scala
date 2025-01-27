package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Char, ((Byte,Byte),Int)], b: T_B[T_A[Char, (Boolean,Char)], T_B[Char, Boolean]], c: T_A[T_B[Int, Byte], T_B[Boolean, Int]]) extends T_A[Boolean, T_B[T_A[Boolean, Char], T_A[Byte, Byte]]]
case class CC_B() extends T_A[Boolean, T_B[T_A[Boolean, Char], T_A[Byte, Byte]]]

val v_a: T_A[Boolean, T_B[T_A[Boolean, Char], T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}