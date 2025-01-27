package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, Char]
case class CC_C[G](a: T_A[G, G], b: (Char,Byte)) extends T_B[G, T_B[Char, Byte]]

val v_a: T_B[Byte, T_B[Char, Byte]] = null
val v_b: Int = v_a match{
  case CC_C(_, ('x',_)) => 0 
}
}
// This is not matched: (CC_B Char (T_A Char))