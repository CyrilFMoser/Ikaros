package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Boolean]], T_A[T_A[(Char,Int), Char], T_A[Int, Boolean]]]
case class CC_B(a: T_A[Char, CC_A], b: Byte) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Boolean]], T_A[T_A[(Char,Int), Char], T_A[Int, Boolean]]]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Byte, Boolean]], T_A[T_A[(Char,Int), Char], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}