package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, Char], C], b: (T_A[Char, (Byte,Boolean)],(Char,Int))) extends T_A[C, T_A[T_A[Byte, Byte], T_A[Boolean, Char]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Byte, Byte], T_A[Boolean, Char]]]

val v_a: T_A[Char, T_A[T_A[Byte, Byte], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,(_,_))) => 0 
  case CC_B() => 1 
}
}