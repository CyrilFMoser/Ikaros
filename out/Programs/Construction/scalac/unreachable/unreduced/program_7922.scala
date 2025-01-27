package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Int], T_A[Char, Byte]]) extends T_A[T_A[T_A[Char, Char], T_A[Char, Boolean]], T_A[T_A[Char, Byte], T_A[Boolean, Byte]]]
case class CC_B(a: (CC_A,(CC_A,CC_A)), b: CC_A) extends T_A[T_A[T_A[Char, Char], T_A[Char, Boolean]], T_A[T_A[Char, Byte], T_A[Boolean, Byte]]]
case class CC_C(a: Byte, b: CC_B, c: CC_B) extends T_A[T_A[T_A[Char, Char], T_A[Char, Boolean]], T_A[T_A[Char, Byte], T_A[Boolean, Byte]]]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Char, Boolean]], T_A[T_A[Char, Byte], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_A(_),(_,_)), CC_A(_)) => 1 
  case CC_C(_, _, _) => 2 
}
}