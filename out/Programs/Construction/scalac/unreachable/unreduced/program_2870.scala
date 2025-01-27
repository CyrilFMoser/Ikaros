package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Char, Boolean], Char], C]
case class CC_B() extends T_A[T_A[T_A[Char, Boolean], Char], T_A[CC_A[Char], T_A[Boolean, Char]]]
case class CC_C(a: CC_B, b: T_A[CC_A[CC_B], (CC_B,Byte)], c: CC_B) extends T_A[T_A[T_A[Char, Boolean], Char], T_A[CC_A[Char], T_A[Boolean, Char]]]

val v_a: T_A[T_A[T_A[Char, Boolean], Char], T_A[CC_A[Char], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}