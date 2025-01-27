package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[(Char,Boolean)], b: T_B[T_A[Char], Boolean]) extends T_A[T_B[T_A[(Byte,Byte)], T_A[Byte]]]
case class CC_B[D](a: D, b: T_A[D], c: D) extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D[F, G]() extends T_B[F, T_B[F, F]]

val v_a: T_A[T_B[T_A[(Byte,Byte)], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B((_,_), _, (_,_)), _) => 0 
  case CC_A(CC_C(), _) => 1 
  case CC_B(_, CC_A(_, _), _) => 2 
  case CC_B(_, CC_B(_, CC_A(_, _), _), _) => 3 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 4 
  case CC_B(_, CC_B(_, CC_C(), _), _) => 5 
  case CC_B(_, CC_C(), _) => 6 
  case CC_C() => 7 
}
}