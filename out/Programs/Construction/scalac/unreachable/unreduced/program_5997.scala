package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[Char, E], b: E) extends T_A[Char, E]
case class CC_B(a: T_A[CC_A[(Char,Char)], (Char,Boolean)], b: (Byte,Boolean)) extends T_A[Char, CC_A[T_A[Char, Int]]]
case class CC_C[G, F](a: F, b: T_B[F, F], c: G) extends T_B[G, F]

val v_a: T_A[Char, CC_A[T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_B(_, (_,true)) => 1 
  case CC_B(_, (_,false)) => 2 
}
}