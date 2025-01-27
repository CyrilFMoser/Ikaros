package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Char], T_A[Int, Byte]], b: (T_A[Boolean, (Byte,Byte)],T_A[Byte, Char])) extends T_A[T_A[T_A[Char, (Byte,Boolean)], T_A[Int, Char]], T_A[T_A[Boolean, Boolean], T_A[Int, Byte]]]
case class CC_B(a: CC_A, b: Char) extends T_A[T_A[T_A[Char, (Byte,Boolean)], T_A[Int, Char]], T_A[T_A[Boolean, Boolean], T_A[Int, Byte]]]

val v_a: T_A[T_A[T_A[Char, (Byte,Boolean)], T_A[Int, Char]], T_A[T_A[Boolean, Boolean], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, _) => 1 
}
}