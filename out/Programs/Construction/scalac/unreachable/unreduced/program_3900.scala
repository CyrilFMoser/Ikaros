package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, Boolean]], b: (T_A[Char, Char],T_A[Char, Int]), c: T_A[C, C]) extends T_A[C, T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]]

val v_a: T_A[Boolean, T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B() => 1 
}
}