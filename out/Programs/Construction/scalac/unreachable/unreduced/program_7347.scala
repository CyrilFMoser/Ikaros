package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[D]) extends T_A[E, D]
case class CC_B() extends T_B[CC_A[T_A[Boolean, Int], T_A[Boolean, Int]]]
case class CC_C(a: T_B[((Boolean,Byte),Char)], b: Int, c: Boolean) extends T_B[CC_A[T_A[Boolean, Int], T_A[Boolean, Int]]]
case class CC_D(a: CC_A[T_A[Char, CC_C], T_A[CC_C, CC_B]], b: CC_C, c: T_A[CC_C, CC_C]) extends T_B[CC_A[T_A[Boolean, Int], T_A[Boolean, Int]]]

val v_a: T_B[CC_A[T_A[Boolean, Int], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(CC_A(_), CC_C(_, _, _), CC_A(_)) => 2 
}
}