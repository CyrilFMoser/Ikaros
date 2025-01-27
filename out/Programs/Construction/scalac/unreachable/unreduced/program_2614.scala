package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Int], T_A[Boolean, (Boolean,Boolean)]], b: ((Int,Char),T_A[Int, Byte]), c: Int) extends T_A[T_A[T_A[Byte, Int], T_A[Int, Boolean]], T_A[Char, T_A[Byte, Char]]]
case class CC_B() extends T_A[T_A[T_A[Byte, Int], T_A[Int, Boolean]], T_A[Char, T_A[Byte, Char]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[Byte, Int], T_A[Int, Boolean]], T_A[Char, T_A[Byte, Char]]]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Int, Boolean]], T_A[Char, T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}