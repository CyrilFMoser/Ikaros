package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C, c: Char) extends T_A[C, T_A[Boolean, T_A[Byte, Byte]]]
case class CC_B[D](a: T_A[CC_A[D], D], b: (Byte,(Boolean,Byte)), c: T_A[D, D]) extends T_A[D, T_A[Boolean, T_A[Byte, Byte]]]
case class CC_C[E]() extends T_A[E, T_A[Boolean, T_A[Byte, Byte]]]

val v_a: T_A[Byte, T_A[Boolean, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, (_,(_,_)), _) => 1 
  case CC_C() => 2 
}
}