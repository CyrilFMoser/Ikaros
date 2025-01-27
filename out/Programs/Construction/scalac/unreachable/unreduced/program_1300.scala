package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[D]]
case class CC_B[E](a: (T_A[Boolean, Char],(Char,Char)), b: E, c: T_B[E]) extends T_A[E, T_B[E]]
case class CC_C(a: T_A[T_B[Byte], T_B[T_B[Byte]]]) extends T_B[Byte]

val v_a: T_A[Boolean, T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), _, _) => 1 
}
}