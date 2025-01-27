package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[(Boolean,Byte), Char], Boolean], T_A[T_A[Int, Int], T_A[Int, Char]]]
case class CC_B(a: T_A[(Char,Boolean), Byte], b: T_A[CC_A, T_A[CC_A, CC_A]], c: CC_A) extends T_A[T_A[T_A[(Boolean,Byte), Char], Boolean], T_A[T_A[Int, Int], T_A[Int, Char]]]

val v_a: T_A[T_A[T_A[(Boolean,Byte), Char], Boolean], T_A[T_A[Int, Int], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}