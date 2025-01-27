package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_B[D], c: T_A[D]) extends T_A[D]
case class CC_C(a: T_A[((Byte,Boolean),Char)], b: Char, c: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_D(a: T_A[(CC_C,CC_C)], b: T_A[Boolean]) extends T_B[Boolean]

val v_a: T_A[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, CC_A()) => 1 
  case CC_B(CC_B(_, _, _), _, CC_A()) => 2 
  case CC_B(CC_A(), _, CC_B(CC_A(), _, CC_A())) => 3 
  case CC_B(CC_B(_, _, _), _, CC_B(CC_A(), _, CC_A())) => 4 
  case CC_B(CC_A(), _, CC_B(CC_A(), _, CC_B(_, _, _))) => 5 
  case CC_B(CC_B(_, _, _), _, CC_B(CC_A(), _, CC_B(_, _, _))) => 6 
  case CC_B(CC_A(), _, CC_B(CC_B(_, _, _), _, CC_A())) => 7 
  case CC_B(CC_B(_, _, _), _, CC_B(CC_B(_, _, _), _, CC_A())) => 8 
  case CC_B(CC_A(), _, CC_B(CC_B(_, _, _), _, CC_B(_, _, _))) => 9 
  case CC_B(CC_B(_, _, _), _, CC_B(CC_B(_, _, _), _, CC_B(_, _, _))) => 10 
}
}