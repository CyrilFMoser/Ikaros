package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Char,Char), T_A[Boolean, Char]], b: Int, c: (T_A[Char, Boolean],Int)) extends T_A[T_A[T_A[Char, Char], T_A[Boolean, Int]], T_A[T_A[Int, Int], T_A[Char, Char]]]
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A[T_A[T_A[Char, Char], T_A[Boolean, Int]], T_A[T_A[Int, Int], T_A[Char, Char]]]
case class CC_C() extends T_A[T_A[T_A[Char, Char], T_A[Boolean, Int]], T_A[T_A[Int, Int], T_A[Char, Char]]]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Boolean, Int]], T_A[T_A[Int, Int], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(CC_A(_, _, _), _, CC_A(_, _, _)) => 1 
  case CC_C() => 2 
}
}