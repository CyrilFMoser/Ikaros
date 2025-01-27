package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Byte, (Int,Boolean)],T_A[Int, Char])) extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Char]], T_A[T_A[Boolean, Byte], T_A[Byte, Int]]]
case class CC_B() extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Char]], T_A[T_A[Boolean, Byte], T_A[Byte, Int]]]
case class CC_C(a: T_A[Byte, CC_B]) extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Char]], T_A[T_A[Boolean, Byte], T_A[Byte, Int]]]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Int, Char]], T_A[T_A[Boolean, Byte], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}