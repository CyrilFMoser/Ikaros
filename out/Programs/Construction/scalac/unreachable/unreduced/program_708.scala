package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Char, T_A[Char, Int]], b: (T_A[Char, Byte],Int)) extends T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Boolean]], T_A[T_A[Char, Boolean], T_A[Byte, Char]]]
case class CC_B(a: (CC_A,CC_A), b: Byte, c: CC_A) extends T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Boolean]], T_A[T_A[Char, Boolean], T_A[Byte, Char]]]
case class CC_C(a: Int, b: T_A[Byte, CC_A]) extends T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Boolean]], T_A[T_A[Char, Boolean], T_A[Byte, Char]]]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Boolean]], T_A[T_A[Char, Boolean], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}