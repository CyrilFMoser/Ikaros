package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean) extends T_A[C, T_A[T_A[Byte, Char], T_A[Byte, (Boolean,Int)]]]
case class CC_B[D](a: CC_A[D], b: CC_A[D], c: (T_A[Boolean, Byte],T_A[Byte, Byte])) extends T_A[D, T_A[T_A[Byte, Char], T_A[Byte, (Boolean,Int)]]]
case class CC_C(a: CC_B[T_A[Boolean, Char]], b: T_A[Char, T_A[Boolean, (Boolean,Boolean)]]) extends T_A[CC_A[CC_A[Byte]], T_A[T_A[Byte, Char], T_A[Byte, (Boolean,Int)]]]

val v_a: T_A[T_A[CC_A[CC_A[Byte]], T_A[T_A[Byte, Char], T_A[Byte, (Boolean,Int)]]], T_A[T_A[Byte, Char], T_A[Byte, (Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, (_,_)) => 1 
}
}