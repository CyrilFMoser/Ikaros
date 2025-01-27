package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[T_A[T_A[Int, Int], T_A[Byte, Byte]], C]
case class CC_B(a: T_A[CC_A[Char], (Char,Char)], b: (CC_A[Boolean],CC_A[Char])) extends T_A[T_A[T_A[Int, Int], T_A[Byte, Byte]], T_A[CC_A[Boolean], T_A[Boolean, Boolean]]]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Byte, Byte]], T_A[CC_A[Boolean], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (CC_A(_),CC_A(_))) => 1 
}
}