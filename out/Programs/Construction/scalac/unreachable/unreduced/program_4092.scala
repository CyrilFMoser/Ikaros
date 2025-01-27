package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: ((Byte,Byte),T_A[Char, Boolean])) extends T_A[T_A[T_A[Char, Char], T_A[Char, Boolean]], Boolean]
case class CC_B() extends T_A[T_A[T_A[Char, Char], T_A[Char, Boolean]], Boolean]
case class CC_C() extends T_A[T_A[T_A[Char, Char], T_A[Char, Boolean]], Boolean]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Char, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_)) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}