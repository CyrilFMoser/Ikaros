package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A], b: Byte) extends T_A
case class CC_C(a: Int) extends T_A
case class CC_D[B](a: ((Boolean,Byte),CC_A), b: T_B[B], c: B) extends T_B[B]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_D(((_,_),CC_A()), CC_D(_, _, _), CC_A()) => 0 
}
}