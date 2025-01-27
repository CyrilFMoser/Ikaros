package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Int, b: (T_A[Byte, Char],T_A[(Boolean,Char), Boolean])) extends T_A[C, Char]
case class CC_B[E]() extends T_A[E, Char]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),_)) => 0 
  case CC_A(_, (CC_B(),_)) => 1 
  case CC_B() => 2 
}
}