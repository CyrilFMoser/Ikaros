package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, (Int,Boolean)], T_A[Byte, Int]], b: T_A[T_A[Byte, Int], T_A[Char, Boolean]]) extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Boolean]], T_A[T_A[Boolean, Boolean], T_A[Char, Int]]]
case class CC_B() extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Boolean]], T_A[T_A[Boolean, Boolean], T_A[Char, Int]]]
case class CC_C(a: T_A[CC_B, CC_A], b: (T_A[CC_A, CC_B],CC_B)) extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Boolean]], T_A[T_A[Boolean, Boolean], T_A[Char, Int]]]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Char, Boolean]], T_A[T_A[Boolean, Boolean], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}