package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, Int], b: Boolean) extends T_A[T_A[T_A[Char, Char], T_A[(Char,Char), Byte]], T_A[T_A[Byte, Boolean], T_A[Boolean, Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Char, Char], T_A[(Char,Char), Byte]], T_A[T_A[Byte, Boolean], T_A[Boolean, Boolean]]]
case class CC_C() extends T_A[T_A[T_A[Char, Char], T_A[(Char,Char), Byte]], T_A[T_A[Byte, Boolean], T_A[Boolean, Boolean]]]

val v_a: T_A[T_A[T_A[Char, Char], T_A[(Char,Char), Byte]], T_A[T_A[Byte, Boolean], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}