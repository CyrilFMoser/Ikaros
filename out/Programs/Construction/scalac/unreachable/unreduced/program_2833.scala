package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: Boolean) extends T_A[E]
case class CC_C(a: CC_A[T_B[Int, Int]], b: Int) extends T_B[(CC_B[Byte],CC_B[Byte]), Boolean]
case class CC_D(a: (Char,T_B[CC_C, Char]), b: T_A[T_B[CC_C, Byte]], c: Int) extends T_B[(CC_B[Byte],CC_B[Byte]), Boolean]

val v_a: T_B[(CC_B[Byte],CC_B[Byte]), Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), _) => 0 
  case CC_D(('x',_), CC_A(_), _) => 1 
  case CC_D(('x',_), CC_B(_), _) => 2 
  case CC_D((_,_), CC_A(_), _) => 3 
  case CC_D((_,_), CC_B(_), _) => 4 
}
}