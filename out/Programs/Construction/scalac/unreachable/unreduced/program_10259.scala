package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, T_A[C, C]]
case class CC_B[E](a: (Char,T_A[Boolean, Char]), b: T_A[T_A[Byte, Byte], T_A[T_A[Byte, Byte], T_A[Byte, Byte]]], c: ((Boolean,(Boolean,Byte)),Byte)) extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
  case CC_B(_, CC_B((_,_), CC_A(), _), _) => 2 
  case CC_B(_, CC_B((_,_), CC_B(_, _, _), _), _) => 3 
}
}