package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int, b: T_A[T_A[Char, Byte], T_A[Boolean, Boolean]], c: (T_A[Byte, Char],Boolean)) extends T_A[T_A[T_A[Int, Int], T_A[Byte, Byte]], T_A[T_A[Int, (Boolean,Boolean)], T_A[Char, Boolean]]]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[Int, Int], T_A[Byte, Byte]], T_A[T_A[Int, (Boolean,Boolean)], T_A[Char, Boolean]]]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Byte, Byte]], T_A[T_A[Int, (Boolean,Boolean)], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(true) => 1 
  case CC_B(false) => 2 
}
}