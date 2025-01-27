package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[T_A[D, D], D]
case class CC_B(a: T_B[(Boolean,Char)], b: (CC_A[Char],(Int,Byte)), c: (T_A[Byte, Char],Int)) extends T_B[T_A[CC_A[Boolean], Int]]
case class CC_C(a: CC_B) extends T_B[T_A[CC_A[Boolean], Int]]

val v_a: T_B[T_A[CC_A[Boolean], Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, (CC_A(_),(_,_)), (_,_)) => 0 
  case CC_C(_) => 1 
}
}